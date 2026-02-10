package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vest: ImageVector? = null

val Icons.Rs.Vest: ImageVector
    get() = _Vest ?: UXIcon(name = "Vest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                lineTo(21f, 3.39f)
                curveToRelative(0f, -1.36f, -0.91f, -2.55f, -2.2f, -2.9f)
                curveToRelative(-1.85f, -0.49f, -3.72f, -0.5f, -3.8f, -0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.08f, 0f, -1.95f, 0.01f, -3.8f, 0.5f)
                curveToRelative(-1.3f, 0.35f, -2.2f, 1.54f, -2.2f, 2.9f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 0.93f, -1.32f, 2.83f, -2f, 3.63f)
                verticalLineToRelative(12.37f)
                lineTo(23f, 24f)
                lineTo(23f, 11.63f)
                curveToRelative(-0.57f, -0.67f, -2f, -2.66f, -2f, -3.63f)
                close()
                moveTo(11f, 22f)
                lineTo(3f, 22f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(3f, 15f)
                verticalLineToRelative(-2.64f)
                curveToRelative(0.59f, -0.75f, 2f, -2.71f, 2f, -4.36f)
                lineTo(5f, 3.39f)
                curveToRelative(0f, -0.45f, 0.29f, -0.85f, 0.72f, -0.96f)
                curveToRelative(0.56f, -0.15f, 1.12f, -0.25f, 1.63f, -0.31f)
                lineToRelative(3.66f, 10.05f)
                verticalLineToRelative(9.82f)
                close()
                moveTo(9.43f, 2f)
                horizontalLineToRelative(5.14f)
                lineToRelative(-2.57f, 7.07f)
                lineToRelative(-2.57f, -7.07f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineTo(13f, 22f)
                lineTo(13f, 12.18f)
                lineToRelative(3.66f, -10.05f)
                curveToRelative(0.5f, 0.06f, 1.07f, 0.16f, 1.63f, 0.31f)
                curveToRelative(0.42f, 0.11f, 0.72f, 0.51f, 0.72f, 0.96f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 1.65f, 1.41f, 3.6f, 2f, 4.36f)
                verticalLineToRelative(2.64f)
                close()
            }
        }.also { _Vest = it}
