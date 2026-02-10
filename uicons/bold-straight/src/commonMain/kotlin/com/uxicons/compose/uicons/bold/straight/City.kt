package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _City: ImageVector? = null

val Icons.Bs.City: ImageVector
    get() = _City ?: UXIcon(name = "City") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15.5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(15.5f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 9.33f)
                curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.02f, -2.48f)
                lineToRelative(2.71f, -2.71f)
                curveToRelative(1.48f, -1.48f, 4.06f, -1.48f, 5.54f, 0f)
                lineToRelative(0.73f, 0.73f)
                verticalLineToRelative(-1.38f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10f, 9.33f)
                curveToRelative(0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f)
                lineToRelative(-2.71f, -2.71f)
                curveToRelative(-0.34f, -0.34f, -0.95f, -0.34f, -1.29f, 0f)
                lineToRelative(-2.71f, 2.71f)
                curveToRelative(-0.09f, 0.1f, -0.15f, 0.22f, -0.15f, 0.35f)
                verticalLineToRelative(11.67f)
                horizontalLineToRelative(7f)
                lineTo(10.0f, 9.33f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(13f, 21f)
                horizontalLineToRelative(8f)
                lineTo(21f, 3.5f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _City = it}
