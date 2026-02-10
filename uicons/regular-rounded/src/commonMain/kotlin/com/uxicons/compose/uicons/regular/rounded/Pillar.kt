package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pillar: ImageVector? = null

val Icons.Rr.Pillar: ImageVector
    get() = _Pillar ?: UXIcon(name = "Pillar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 2.31f, 1.76f, 4.2f, 4f, 4.45f)
                verticalLineToRelative(13.05f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-13.05f)
                curveToRelative(2.24f, -0.25f, 4f, -2.14f, 4f, -4.45f)
                close()
                moveTo(2f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.24f, 0f, -2.3f, -0.92f, -2.48f, -2.14f)
                curveToRelative(-0.08f, -0.55f, -0.59f, -0.93f, -1.13f, -0.85f)
                curveToRelative(-0.55f, 0.08f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.1f, 0.69f, 0.37f, 1.31f, 0.74f, 1.86f)
                horizontalLineToRelative(-7.57f)
                curveToRelative(0.37f, -0.55f, 0.64f, -1.17f, 0.74f, -1.86f)
                curveToRelative(0.08f, -0.55f, -0.3f, -1.05f, -0.85f, -1.13f)
                curveToRelative(-0.54f, -0.08f, -1.05f, 0.3f, -1.13f, 0.85f)
                curveToRelative(-0.17f, 1.22f, -1.24f, 2.14f, -2.48f, 2.14f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(15f, 22f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Pillar = it}
