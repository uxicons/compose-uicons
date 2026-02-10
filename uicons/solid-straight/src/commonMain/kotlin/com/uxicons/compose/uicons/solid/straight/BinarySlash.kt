package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BinarySlash: ImageVector? = null

val Icons.Ss.BinarySlash: ImageVector
    get() = _BinarySlash ?: UXIcon(name = "BinarySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.42f, 5f)
                lineToRelative(-1.43f, -1.39f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                lineTo(19.01f, 11f)
                horizontalLineToRelative(-2f)
                lineTo(17.01f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                close()
                moveTo(7.49f, 13f)
                lineToRelative(-3.51f, 3.6f)
                lineToRelative(1.43f, 1.39f)
                lineToRelative(1.58f, -1.63f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(2f)
                lineTo(8.99f, 13f)
                horizontalLineToRelative(-1.51f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.52f, -1.61f, 2.01f, -2.79f, 3.79f, -2.79f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.96f, -0.37f, 1.88f, -0.99f, 2.6f)
                lineToRelative(3.64f, 3.64f)
                curveToRelative(0.43f, -0.15f, 0.88f, -0.24f, 1.35f, -0.24f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1.59f)
                lineToRelative(3.96f, 3.96f)
                close()
                moveTo(6f, 4.59f)
                lineToRelative(3.6f, 3.6f)
                curveToRelative(0.25f, -0.34f, 0.4f, -0.76f, 0.4f, -1.19f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(16f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.76f)
                lineToRelative(-1.93f, -1.93f)
                curveToRelative(-0.04f, 0.23f, -0.07f, 0.45f, -0.07f, 0.68f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(1.04f, 0f, 1.98f, -0.41f, 2.69f, -1.06f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.35f, 0.29f, -0.79f, 0.48f, -1.28f, 0.48f)
                close()
            }
        }.also { _BinarySlash = it}
