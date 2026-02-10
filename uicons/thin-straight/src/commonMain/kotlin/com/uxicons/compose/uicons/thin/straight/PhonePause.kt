package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePause: ImageVector? = null

val Icons.Ts.PhonePause: ImageVector
    get() = _PhonePause ?: UXIcon(name = "PhonePause") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.53f, 13.84f)
                lineToRelative(-3.38f, 3.38f)
                curveToRelative(-3.4f, -1.38f, -5.87f, -3.86f, -7.36f, -7.37f)
                lineToRelative(3.37f, -3.37f)
                lineTo(4.48f, 0.79f)
                lineTo(1.61f, 3.67f)
                curveToRelative(-1.04f, 1.03f, -1.61f, 2.43f, -1.61f, 3.94f)
                curveToRelative(0f, 7.2f, 9.19f, 16.39f, 16.39f, 16.39f)
                curveToRelative(1.51f, 0f, 2.91f, -0.57f, 3.94f, -1.6f)
                lineToRelative(2.88f, -2.88f)
                lineToRelative(-5.68f, -5.68f)
                close()
                moveTo(19.62f, 21.69f)
                curveToRelative(-0.84f, 0.85f, -1.99f, 1.31f, -3.23f, 1.31f)
                curveTo(9.77f, 23f, 1f, 14.23f, 1f, 7.61f)
                curveToRelative(0f, -1.24f, 0.47f, -2.39f, 1.31f, -3.23f)
                lineToRelative(2.17f, -2.17f)
                lineToRelative(4.26f, 4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(0.12f, 0.31f)
                curveToRelative(1.62f, 4.05f, 4.44f, 6.86f, 8.36f, 8.35f)
                lineToRelative(0.3f, 0.12f)
                lineToRelative(3.13f, -3.13f)
                lineToRelative(4.26f, 4.26f)
                lineToRelative(-2.17f, 2.17f)
                close()
                moveTo(22f, 8f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _PhonePause = it}
