package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SirenOn: ImageVector? = null

val Icons.Ts.SirenOn: ImageVector
    get() = _SirenOn ?: UXIcon(name = "SirenOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 19.02f)
                horizontalLineToRelative(-0.29f)
                lineToRelative(-1.31f, -9.73f)
                curveToRelative(-0.23f, -1.87f, -1.83f, -3.29f, -3.72f, -3.29f)
                lineTo(7.83f, 6f)
                curveToRelative(-1.89f, 0f, -3.49f, 1.41f, -3.72f, 3.28f)
                lineToRelative(-1.31f, 9.74f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.48f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2.48f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.1f, 9.41f)
                curveToRelative(0.17f, -1.37f, 1.34f, -2.41f, 2.73f, -2.41f)
                horizontalLineToRelative(8.35f)
                curveToRelative(1.38f, 0f, 2.56f, 1.04f, 2.73f, 2.41f)
                lineToRelative(1.3f, 9.6f)
                lineTo(3.8f, 19.02f)
                lineToRelative(1.3f, -9.61f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-1.48f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.48f)
                close()
                moveTo(8.15f, 10f)
                horizontalLineToRelative(3.85f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.97f)
                lineToRelative(-0.41f, 3f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(0.54f, -4f)
                close()
                moveTo(3.48f, 5.96f)
                lineTo(0.73f, 3.33f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(2.75f, 2.63f)
                lineToRelative(-0.69f, 0.72f)
                close()
                moveTo(6.95f, 4.06f)
                lineToRelative(-0.54f, -3.79f)
                lineToRelative(0.99f, -0.14f)
                lineToRelative(0.54f, 3.79f)
                lineToRelative(-0.99f, 0.14f)
                close()
                moveTo(17.05f, 4.06f)
                lineToRelative(-0.99f, -0.14f)
                lineToRelative(0.54f, -3.79f)
                lineToRelative(0.99f, 0.14f)
                lineToRelative(-0.54f, 3.79f)
                close()
                moveTo(20.52f, 5.96f)
                lineToRelative(-0.69f, -0.72f)
                lineToRelative(2.75f, -2.63f)
                lineToRelative(0.69f, 0.72f)
                lineToRelative(-2.75f, 2.63f)
                close()
            }
        }.also { _SirenOn = it}
