package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crutch: ImageVector? = null

val Icons.Ts.Crutch: ImageVector
    get() = _Crutch ?: UXIcon(name = "Crutch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.94f, 9.06f)
                lineTo(14.94f, 0.06f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.32f, 1.32f)
                lineToRelative(-5.68f, 5.68f)
                curveToRelative(-1.85f, 1.85f, -2.87f, 4.31f, -2.87f, 6.92f)
                verticalLineToRelative(1.6f)
                lineTo(0.04f, 23.26f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.96f, -6.96f)
                horizontalLineToRelative(1.6f)
                curveToRelative(2.62f, 0f, 5.07f, -1.02f, 6.92f, -2.87f)
                lineToRelative(5.68f, -5.68f)
                lineToRelative(1.32f, 1.32f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(8f, 16f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0f, -2.18f, 0.79f, -4.24f, 2.23f, -5.85f)
                lineToRelative(4.93f, 4.93f)
                curveToRelative(-1.61f, 1.44f, -3.67f, 2.23f, -5.85f, 2.23f)
                horizontalLineToRelative(-1.31f)
                close()
                moveTo(15.88f, 13.07f)
                lineToRelative(-4.95f, -4.95f)
                lineToRelative(5.33f, -5.33f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-5.33f, 5.33f)
                close()
            }
        }.also { _Crutch = it}
