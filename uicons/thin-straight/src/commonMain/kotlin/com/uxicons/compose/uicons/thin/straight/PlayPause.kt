package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Ts.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21.52f)
                lineTo(2f, 2.48f)
                lineToRelative(11.98f, 7.65f)
                curveToRelative(0.64f, 0.4f, 1.02f, 1.1f, 1.02f, 1.86f)
                curveToRelative(0f, 0.76f, -0.39f, 1.46f, -1.03f, 1.86f)
                lineTo(2f, 21.52f)
                close()
                moveTo(3f, 4.3f)
                verticalLineToRelative(15.38f)
                lineToRelative(10.43f, -6.68f)
                curveToRelative(0.36f, -0.23f, 0.57f, -0.6f, 0.57f, -1.02f)
                curveToRelative(0f, -0.41f, -0.21f, -0.79f, -0.56f, -1.01f)
                lineTo(3f, 4.3f)
                close()
                moveTo(22f, 21f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 3f)
                horizontalLineToRelative(1f)
                lineTo(22f, 21f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 3f)
                horizontalLineToRelative(1f)
                lineTo(18f, 21f)
                close()
            }
        }.also { _PlayPause = it}
