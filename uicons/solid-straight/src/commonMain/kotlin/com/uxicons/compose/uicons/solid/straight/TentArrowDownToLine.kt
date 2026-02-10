package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowDownToLine: ImageVector? = null

val Icons.Ss.TentArrowDownToLine: ImageVector
    get() = _TentArrowDownToLine ?: UXIcon(name = "TentArrowDownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 9.0f)
                curveToRelative(0.51f, 0f, 1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.0f)
                lineTo(1.71f, 3.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                close()
                moveTo(23.6f, 20.14f)
                lineTo(14.0f, 6.24f)
                lineTo(3.18f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8.72f)
                lineToRelative(5.28f, -8f)
                lineToRelative(5.29f, 8f)
                horizontalLineToRelative(2.15f)
                curveToRelative(0.94f, 0f, 1.79f, -0.5f, 2.25f, -1.3f)
                curveToRelative(0.45f, -0.79f, 0.43f, -1.73f, -0.08f, -2.56f)
                close()
                moveTo(11.11f, 24f)
                horizontalLineToRelative(5.78f)
                lineToRelative(-2.89f, -4.37f)
                lineToRelative(-2.89f, 4.37f)
                close()
            }
        }.also { _TentArrowDownToLine = it}
