package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Rr.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.86f, 1.14f)
                curveToRelative(-1.09f, -1.09f, -2.66f, -1.43f, -4.14f, -0.87f)
                lineTo(2.33f, 7.06f)
                curveTo(0.39f, 7.79f, -0.21f, 9.6f, 0.06f, 11.06f)
                curveToRelative(0.27f, 1.47f, 1.46f, 2.95f, 3.53f, 2.95f)
                horizontalLineToRelative(6.38f)
                verticalLineToRelative(6.39f)
                curveToRelative(0f, 2.07f, 1.48f, 3.27f, 2.95f, 3.53f)
                curveToRelative(0.22f, 0.04f, 0.45f, 0.06f, 0.67f, 0.06f)
                curveToRelative(1.31f, 0f, 2.71f, -0.67f, 3.32f, -2.29f)
                lineToRelative(6.83f, -16.46f)
                curveToRelative(0.54f, -1.44f, 0.2f, -3.02f, -0.89f, -4.11f)
                close()
                moveTo(21.88f, 4.51f)
                lineToRelative(-6.83f, 16.46f)
                curveToRelative(-0.35f, 0.92f, -1.15f, 1.12f, -1.77f, 1.0f)
                curveToRelative(-0.63f, -0.12f, -1.31f, -0.59f, -1.31f, -1.56f)
                verticalLineToRelative(-7.39f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3.6f, 12.01f)
                curveToRelative(-0.98f, 0f, -1.45f, -0.68f, -1.57f, -1.31f)
                curveToRelative(-0.11f, -0.63f, 0.09f, -1.43f, 1.03f, -1.78f)
                lineTo(19.46f, 2.13f)
                curveToRelative(0.23f, -0.09f, 0.46f, -0.13f, 0.68f, -0.13f)
                curveToRelative(0.48f, 0f, 0.94f, 0.19f, 1.31f, 0.56f)
                curveToRelative(0.54f, 0.54f, 0.69f, 1.28f, 0.44f, 1.96f)
                close()
            }
        }.also { _LocationArrow = it}
