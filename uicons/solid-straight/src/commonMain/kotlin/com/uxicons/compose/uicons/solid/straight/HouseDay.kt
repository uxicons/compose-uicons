package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseDay: ImageVector? = null

val Icons.Ss.HouseDay: ImageVector
    get() = _HouseDay ?: UXIcon(name = "HouseDay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 12.75f)
                lineToRelative(-5.45f, -4.26f)
                curveToRelative(-0.82f, -0.65f, -1.98f, -0.65f, -2.8f, 0f)
                lineToRelative(-5.45f, 4.26f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(8.89f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8.89f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(7.92f, 11.17f)
                curveToRelative(-1.01f, 0.79f, -1.67f, 1.92f, -1.86f, 3.17f)
                lineToRelative(-2.56f, 2.57f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.17f, -2.17f)
                curveToRelative(-0.6f, -0.82f, -1.01f, -1.78f, -1.18f, -2.83f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.08f)
                curveToRelative(0.16f, -1.05f, 0.58f, -2.01f, 1.18f, -2.83f)
                lineToRelative(-2.18f, -2.18f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.18f, 2.18f)
                curveToRelative(0.82f, -0.6f, 1.78f, -1.01f, 2.83f, -1.18f)
                lineTo(8.5f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.08f)
                curveToRelative(1.05f, 0.16f, 2.01f, 0.57f, 2.83f, 1.17f)
                lineToRelative(2.18f, -2.18f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.18f, 2.18f)
                lineToRelative(-0.95f, 0.95f)
                lineToRelative(-5.88f, 4.56f)
                close()
            }
        }.also { _HouseDay = it}
