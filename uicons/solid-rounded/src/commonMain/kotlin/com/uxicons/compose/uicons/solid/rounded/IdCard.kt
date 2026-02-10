package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IdCard: ImageVector? = null

val Icons.Sr.IdCard: ImageVector
    get() = _IdCard ?: UXIcon(name = "IdCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(6.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(9.2f, 16.98f)
                curveToRelative(-0.07f, 0.01f, -0.14f, 0.02f, -0.2f, 0.02f)
                curveToRelative(-0.46f, 0f, -0.88f, -0.33f, -0.98f, -0.8f)
                curveToRelative(-0.14f, -0.7f, -0.78f, -1.2f, -1.52f, -1.2f)
                reflectiveCurveToRelative(-1.38f, 0.51f, -1.52f, 1.2f)
                curveToRelative(-0.11f, 0.54f, -0.64f, 0.88f, -1.18f, 0.78f)
                curveToRelative(-0.54f, -0.11f, -0.89f, -0.64f, -0.78f, -1.18f)
                curveToRelative(0.34f, -1.62f, 1.8f, -2.8f, 3.48f, -2.8f)
                reflectiveCurveToRelative(3.14f, 1.18f, 3.48f, 2.8f)
                curveToRelative(0.11f, 0.54f, -0.23f, 1.07f, -0.78f, 1.18f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _IdCard = it}
