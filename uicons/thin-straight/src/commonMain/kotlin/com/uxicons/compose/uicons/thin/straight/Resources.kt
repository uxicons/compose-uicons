package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Ts.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(4.33f)
                lineToRelative(-2.57f, -4.33f)
                curveToRelative(-0.36f, -0.62f, -1.01f, -1.0f, -1.73f, -1.0f)
                reflectiveCurveToRelative(-1.37f, 0.37f, -1.73f, 1.0f)
                lineTo(0.11f, 14f)
                horizontalLineToRelative(7.18f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -1.07f, -0.24f, -2.09f, -0.68f, -3f)
                horizontalLineToRelative(3.68f)
                lineTo(24.0f, 2f)
                close()
                moveTo(1.83f, 13f)
                lineTo(7.83f, 2.5f)
                curveToRelative(0.36f, -0.63f, 1.37f, -0.63f, 1.74f, 0.0f)
                lineToRelative(3.43f, 5.79f)
                verticalLineToRelative(0.78f)
                curveToRelative(-2.35f, 0.34f, -4.33f, 1.85f, -5.32f, 3.93f)
                lineTo(1.83f, 13f)
                close()
                moveTo(14f, 22f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(23f, 12f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-1.27f, -1.81f, -3.37f, -3f, -5.74f, -3f)
                lineTo(14f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Resources = it}
