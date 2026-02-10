package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pillar: ImageVector? = null

val Icons.Rs.Pillar: ImageVector
    get() = _Pillar ?: UXIcon(name = "Pillar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 2.31f, 1.76f, 4.2f, 4f, 4.45f)
                verticalLineToRelative(13.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-13.05f)
                curveToRelative(2.24f, -0.25f, 4f, -2.14f, 4f, -4.45f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(12f)
                close()
                moveTo(19.5f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.02f, 0.17f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 0.93f, 0.28f, 1.78f, 0.76f, 2.5f)
                horizontalLineToRelative(-7.52f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.57f, 0.76f, -2.5f)
                curveToRelative(0f, -0.17f, -0.03f, -0.33f, -0.05f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Pillar = it}
