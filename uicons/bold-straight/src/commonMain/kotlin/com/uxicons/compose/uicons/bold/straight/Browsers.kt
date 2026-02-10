package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browsers: ImageVector? = null

val Icons.Bs.Browsers: ImageVector
    get() = _Browsers ?: UXIcon(name = "Browsers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 1f)
                lineTo(8.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 18f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 15f)
                lineTo(8f, 6f)
                horizontalLineToRelative(13f)
                lineTo(21f, 15f)
                lineTo(8f, 15f)
                close()
                moveTo(3f, 20f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                lineTo(0f, 23f)
                lineTo(0f, 9.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                verticalLineToRelative(13.95f)
                close()
            }
        }.also { _Browsers = it}
