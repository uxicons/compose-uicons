package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareRoot: ImageVector? = null

val Icons.Ts.SquareRoot: ImageVector
    get() = _SquareRoot ?: UXIcon(name = "SquareRoot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-9.49f)
                curveToRelative(-0.67f, 0f, -1.26f, 0.45f, -1.44f, 1.08f)
                lineToRelative(-5.17f, 17.92f)
                horizontalLineToRelative(-1.26f)
                lineToRelative(-3.66f, -10.97f)
                curveToRelative(-0.2f, -0.61f, -0.78f, -1.03f, -1.42f, -1.03f)
                lineTo(0f, 10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.56f)
                curveToRelative(1.08f, 0f, 2.03f, 0.69f, 2.37f, 1.71f)
                lineToRelative(3.31f, 9.94f)
                lineTo(12.1f, 3.81f)
                curveToRelative(0.31f, -1.06f, 1.29f, -1.81f, 2.4f, -1.81f)
                horizontalLineToRelative(9.49f)
                close()
                moveTo(22.72f, 12f)
                lineToRelative(-3.21f, 4.22f)
                lineToRelative(-3.21f, -4.22f)
                horizontalLineToRelative(-1.26f)
                lineToRelative(3.84f, 5.05f)
                lineToRelative(-3.76f, 4.95f)
                horizontalLineToRelative(1.26f)
                lineToRelative(3.13f, -4.12f)
                lineToRelative(3.13f, 4.12f)
                horizontalLineToRelative(1.26f)
                lineToRelative(-3.76f, -4.95f)
                lineToRelative(3.84f, -5.05f)
                horizontalLineToRelative(-1.26f)
                close()
            }
        }.also { _SquareRoot = it}
