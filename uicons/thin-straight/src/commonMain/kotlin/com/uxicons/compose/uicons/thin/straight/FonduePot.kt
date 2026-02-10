package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FonduePot: ImageVector? = null

val Icons.Ts.FonduePot: ImageVector
    get() = _FonduePot ?: UXIcon(name = "FonduePot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                horizontalLineToRelative(-5.46f)
                lineToRelative(3.58f, -6.01f)
                lineToRelative(-0.86f, -0.51f)
                lineToRelative(-3.89f, 6.52f)
                horizontalLineToRelative(-3.77f)
                lineTo(15.33f, 0.46f)
                lineToRelative(-0.97f, -0.22f)
                lineToRelative(-1.77f, 7.76f)
                horizontalLineToRelative(-5.96f)
                lineTo(2.74f, 1.48f)
                lineToRelative(-0.86f, 0.51f)
                lineToRelative(3.58f, 6.01f)
                lineTo(0f, 8.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 2.91f, 1.67f, 5.44f, 4.09f, 6.68f)
                lineToRelative(-1.74f, 3.82f)
                horizontalLineToRelative(1.1f)
                lineToRelative(1.36f, -3f)
                horizontalLineToRelative(10.36f)
                lineToRelative(1.36f, 3f)
                horizontalLineToRelative(1.1f)
                lineToRelative(-1.74f, -3.82f)
                curveToRelative(2.43f, -1.24f, 4.1f, -3.77f, 4.1f, -6.68f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-1f)
                lineTo(3f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4.5f)
                close()
            }
        }.also { _FonduePot = it}
