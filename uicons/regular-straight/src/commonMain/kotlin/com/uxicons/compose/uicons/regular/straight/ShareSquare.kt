package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Rs.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 17.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                verticalLineTo(9.99f)
                curveTo(0f, 8.33f, 1.35f, 6.99f, 3f, 6.99f)
                horizontalLineTo(7.03f)
                curveToRelative(-0.44f, 0.58f, -0.77f, 1.26f, -0.92f, 2f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineTo(15f)
                verticalLineToRelative(-4f)
                close()
                moveTo(23.41f, 6.57f)
                lineTo(16.86f, 0.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.56f, 5.56f)
                horizontalLineTo(11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.99f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                lineToRelative(-5.61f, 5.61f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.61f, -6.61f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _ShareSquare = it}
