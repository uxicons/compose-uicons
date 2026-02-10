package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhone: ImageVector? = null

val Icons.Ss.SquarePhone: ImageVector
    get() = _SquarePhone ?: UXIcon(name = "SquarePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.7f, 14.67f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(-0.8f, 0.8f)
                curveToRelative(-0.41f, 0.41f, -0.98f, 0.64f, -1.59f, 0.64f)
                curveToRelative(-1.84f, 0f, -4.11f, -1.17f, -6.05f, -3.13f)
                curveToRelative(-1.94f, -1.96f, -3.14f, -4.28f, -3.14f, -6.06f)
                curveToRelative(0f, -0.61f, 0.23f, -1.18f, 0.64f, -1.59f)
                lineToRelative(0.8f, -0.8f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(-1.33f, 1.33f)
                curveToRelative(0.53f, 1.53f, 1.32f, 3.0f, 2.37f, 4.0f)
                curveToRelative(0.98f, 1.01f, 2.47f, 1.82f, 3.99f, 2.37f)
                lineToRelative(1.34f, -1.34f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(20.41f, 16.56f)
                lineTo(15.7f, 11.84f)
                lineTo(13.89f, 13.65f)
                curveToRelative(-0.85f, -0.4f, -1.55f, -0.87f, -2.12f, -1.43f)
                curveToRelative(-0.58f, -0.57f, -1.05f, -1.26f, -1.43f, -2.1f)
                lineToRelative(1.82f, -1.82f)
                lineToRelative(-4.71f, -4.72f)
                lineToRelative(-2.21f, 2.21f)
                curveToRelative(-0.79f, 0.79f, -1.23f, 1.86f, -1.23f, 3.01f)
                curveToRelative(0f, 2.32f, 1.39f, 5.12f, 3.72f, 7.47f)
                curveToRelative(2.35f, 2.37f, 5.07f, 3.73f, 7.47f, 3.73f)
                curveToRelative(1.15f, 0f, 2.22f, -0.44f, 3.01f, -1.23f)
                lineToRelative(2.21f, -2.21f)
                close()
            }
        }.also { _SquarePhone = it}
