package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileConversion: ImageVector? = null

val Icons.Rs.FileConversion: ImageVector
    get() = _FileConversion ?: UXIcon(name = "FileConversion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6.83f)
                lineToRelative(3.17f, 3.08f)
                verticalLineToRelative(4.92f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18.82f, 10f)
                lineTo(22f, 13.08f)
                verticalLineToRelative(10.92f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(20f, 22f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(10f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.51f, 2.51f)
                curveToRelative(-0.77f, 0.78f, -0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(2.51f, 2.51f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.51f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4.91f, 16.09f)
                lineTo(3.5f, 17.5f)
                lineTo(5.0f, 19f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.51f, -2.51f)
                curveToRelative(0.77f, -0.77f, 0.77f, -2.04f, 0f, -2.81f)
                lineToRelative(-2.51f, -2.51f)
                close()
            }
        }.also { _FileConversion = it}
