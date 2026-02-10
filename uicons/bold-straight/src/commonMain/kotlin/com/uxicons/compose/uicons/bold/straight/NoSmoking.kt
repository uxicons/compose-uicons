package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoSmoking: ImageVector? = null

val Icons.Bs.NoSmoking: ImageVector
    get() = _NoSmoking ?: UXIcon(name = "NoSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 0.67f)
                lineTo(16f, 0f)
                horizontalLineToRelative(3f)
                lineTo(19f, 0.67f)
                curveToRelative(0f, 0.17f, 0.33f, 0.48f, 0.33f, 0.48f)
                lineToRelative(2.05f, 1.43f)
                curveToRelative(1.72f, 1.05f, 2.62f, 2.58f, 2.62f, 4.42f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -0.49f, -0.13f, -1.23f, -1.21f, -1.88f)
                lineToRelative(-2.14f, -1.48f)
                curveToRelative(-1.02f, -0.64f, -1.65f, -1.77f, -1.65f, -2.97f)
                close()
                moveTo(13.67f, 6.57f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(0.45f, 0.27f, 0.73f, 0.76f, 0.73f, 1.29f)
                verticalLineToRelative(0.18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.18f)
                curveToRelative(0f, -1.57f, -0.84f, -3.05f, -2.19f, -3.86f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-0.75f, -0.45f, -1.21f, -1.27f, -1.21f, -2.14f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 1.92f, 1.02f, 3.73f, 2.67f, 4.72f)
                close()
                moveTo(21f, 18.88f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-4.88f)
                horizontalLineToRelative(-4.88f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.84f, -1.84f)
                horizontalLineToRelative(1.88f)
                lineTo(24f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6.88f)
                close()
                moveTo(12.16f, 16.94f)
                lineToRelative(3.06f, 3.06f)
                lineTo(0f, 20f)
                lineTo(0f, 12f)
                lineTo(7.22f, 12f)
                lineToRelative(2.87f, 2.87f)
                verticalLineToRelative(2.05f)
                lineToRelative(2.07f, 0.02f)
                close()
                moveTo(7f, 15f)
                lineTo(3f, 15f)
                verticalLineToRelative(2f)
                lineTo(7f, 17f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _NoSmoking = it}
