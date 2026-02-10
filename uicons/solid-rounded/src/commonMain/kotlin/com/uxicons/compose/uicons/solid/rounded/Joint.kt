package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joint: ImageVector? = null

val Icons.Sr.Joint: ImageVector
    get() = _Joint ?: UXIcon(name = "Joint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.59f, 23f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-6f, -6f)
                horizontalLineToRelative(4.17f)
                lineToRelative(6f, 6f)
                close()
                moveTo(21.5f, 17f)
                horizontalLineToRelative(-6.09f)
                lineToRelative(6f, 6f)
                horizontalLineToRelative(0.09f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.69f, 17.1f)
                curveToRelative(-2.73f, 0.42f, -5.13f, 1.99f, -5.24f, 2.06f)
                curveToRelative(-0.28f, 0.19f, -0.45f, 0.5f, -0.45f, 0.83f)
                reflectiveCurveToRelative(0.17f, 0.65f, 0.45f, 0.83f)
                curveToRelative(0.13f, 0.09f, 3.32f, 2.17f, 6.52f, 2.17f)
                horizontalLineToRelative(4.62f)
                lineToRelative(-5.9f, -5.9f)
                close()
                moveTo(20f, 14f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -1.4f, -0.74f, -2.71f, -1.94f, -3.43f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.52f, -1.46f, -2.57f)
                verticalLineToRelative(-1.86f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.86f)
                curveToRelative(0f, 1.75f, 0.93f, 3.39f, 2.43f, 4.29f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(0.6f, 0.36f, 0.97f, 1.02f, 0.97f, 1.72f)
                verticalLineToRelative(2.18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -1.75f, -0.93f, -3.39f, -2.43f, -4.29f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.3f, -0.18f, -0.48f, -0.51f, -0.48f, -0.86f)
                lineTo(19.0f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.87f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(0.9f, 0.54f, 1.46f, 1.52f, 1.46f, 2.57f)
                verticalLineToRelative(1.74f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Joint = it}
