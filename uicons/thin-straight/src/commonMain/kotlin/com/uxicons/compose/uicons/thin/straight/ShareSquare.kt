package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Ts.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 17f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                lineTo(0f, 24f)
                lineTo(0f, 9.5f)
                curveTo(0f, 8.12f, 1.12f, 7f, 2.5f, 7f)
                lineTo(6.76f, 7f)
                curveToRelative(-0.21f, 0.31f, -0.36f, 0.65f, -0.49f, 1f)
                lineTo(2.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-6f)
                close()
                moveTo(23.56f, 6.44f)
                lineTo(17.12f, 0f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(6.29f, 6.29f)
                lineTo(10.5f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1f)
                lineTo(9f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(12.21f)
                lineToRelative(-6.27f, 6.27f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.42f, -6.42f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _ShareSquare = it}
