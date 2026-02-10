package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloorAlt: ImageVector? = null

val Icons.Sr.FloorAlt: ImageVector
    get() = _FloorAlt ?: UXIcon(name = "FloorAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 20f)
                lineTo(6f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(18f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(2.98f)
                lineTo(7.39f, 0f)
                horizontalLineToRelative(-2.89f)
                close()
                moveTo(8.13f, 6.45f)
                lineToRelative(-2.16f, -2.16f)
                lineTo(0f, 10.33f)
                verticalLineToRelative(1.17f)
                curveToRelative(0f, 0.88f, 0.26f, 1.69f, 0.7f, 2.38f)
                lineToRelative(7.43f, -7.43f)
                close()
                moveTo(9.54f, 5.04f)
                lineTo(13.88f, 0.7f)
                curveToRelative(-0.69f, -0.44f, -1.5f, -0.7f, -2.38f, -0.7f)
                horizontalLineToRelative(-1.3f)
                lineToRelative(-2.83f, 2.87f)
                lineToRelative(2.17f, 2.17f)
                close()
                moveTo(6.19f, 11.22f)
                lineToRelative(-4.08f, 4.08f)
                curveToRelative(0.69f, 0.44f, 1.51f, 0.7f, 2.39f, 0.7f)
                horizontalLineToRelative(1.3f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(-2.19f, -2.19f)
                close()
                moveTo(11.5f, 16f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2.87f)
                lineToRelative(-7.37f, 7.37f)
                horizontalLineToRelative(2.87f)
                close()
                moveTo(7.6f, 9.8f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(6.2f, -6.2f)
                verticalLineToRelative(-1.3f)
                curveToRelative(0f, -0.88f, -0.26f, -1.7f, -0.7f, -2.39f)
                lineToRelative(-7.69f, 7.69f)
                close()
            }
        }.also { _FloorAlt = it}
