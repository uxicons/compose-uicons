package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crutch: ImageVector? = null

val Icons.Rs.Crutch: ImageVector
    get() = _Crutch ?: UXIcon(name = "Crutch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 9.04f)
                lineTo(14.96f, 0.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(0.96f, 0.96f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-1.94f, 1.94f, -3.01f, 4.53f, -3.01f, 7.28f)
                verticalLineToRelative(1.4f)
                lineTo(0.03f, 22.56f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.97f, -5.97f)
                horizontalLineToRelative(1.4f)
                curveToRelative(2.75f, 0f, 5.33f, -1.07f, 7.28f, -3.01f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(0.96f, 0.96f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(8f, 16f)
                verticalLineToRelative(-0.81f)
                curveToRelative(0f, -1.88f, 0.62f, -3.66f, 1.76f, -5.11f)
                lineToRelative(4.16f, 4.16f)
                curveToRelative(-1.45f, 1.14f, -3.23f, 1.76f, -5.11f, 1.76f)
                horizontalLineToRelative(-0.81f)
                close()
                moveTo(15.38f, 12.87f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(4.79f, -4.79f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-4.79f, 4.79f)
                close()
            }
        }.also { _Crutch = it}
