package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joint: ImageVector? = null

val Icons.Ss.Joint: ImageVector
    get() = _Joint ?: UXIcon(name = "Joint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.41f, 17f)
                horizontalLineToRelative(4.76f)
                lineToRelative(6f, 6f)
                horizontalLineToRelative(-4.76f)
                lineToRelative(-6f, -6f)
                close()
                moveTo(5.69f, 17.1f)
                curveToRelative(-2.73f, 0.41f, -5.12f, 1.96f, -5.24f, 2.03f)
                lineToRelative(-0.45f, 0.35f)
                verticalLineToRelative(1.08f)
                lineToRelative(0.46f, 0.29f)
                curveToRelative(0.13f, 0.09f, 3.31f, 2.13f, 6.52f, 2.13f)
                horizontalLineToRelative(4.62f)
                lineToRelative(-5.9f, -5.9f)
                close()
                moveTo(16f, 17f)
                lineToRelative(6f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(20f, 12.82f)
                curveToRelative(0f, -1.4f, -0.74f, -2.71f, -1.94f, -3.43f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.52f, -1.46f, -2.57f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 1.75f, 0.93f, 3.39f, 2.43f, 4.29f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(0.6f, 0.36f, 0.97f, 1.02f, 0.97f, 1.72f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.18f)
                close()
                moveTo(24f, 11.27f)
                curveToRelative(0f, -1.75f, -0.93f, -3.39f, -2.43f, -4.29f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.3f, -0.18f, -0.48f, -0.51f, -0.48f, -0.86f)
                lineTo(19.0f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(0.9f, 0.54f, 1.46f, 1.52f, 1.46f, 2.57f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.74f)
                close()
            }
        }.also { _Joint = it}
