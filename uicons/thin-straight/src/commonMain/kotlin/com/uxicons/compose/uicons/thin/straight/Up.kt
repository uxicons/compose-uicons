package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Ts.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 11f)
                lineTo(0.33f, 11f)
                lineTo(10.17f, 0.76f)
                curveToRelative(0.49f, -0.49f, 1.14f, -0.76f, 1.83f, -0.76f)
                horizontalLineToRelative(0f)
                curveToRelative(0.69f, 0f, 1.35f, 0.27f, 1.84f, 0.76f)
                lineToRelative(9.84f, 10.24f)
                horizontalLineToRelative(-6.67f)
                verticalLineToRelative(13f)
                close()
                moveTo(8f, 23f)
                horizontalLineToRelative(8f)
                lineTo(16f, 10f)
                horizontalLineToRelative(5.33f)
                lineTo(13.12f, 1.46f)
                curveToRelative(-0.29f, -0.3f, -0.7f, -0.46f, -1.12f, -0.46f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, 0f, -0.82f, 0.17f, -1.12f, 0.47f)
                lineTo(2.67f, 10f)
                horizontalLineToRelative(5.33f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Up = it}
