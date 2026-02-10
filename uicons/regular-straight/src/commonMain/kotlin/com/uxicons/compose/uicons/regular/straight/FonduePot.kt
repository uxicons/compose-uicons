package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FonduePot: ImageVector? = null

val Icons.Rs.FonduePot: ImageVector
    get() = _FonduePot ?: UXIcon(name = "FonduePot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.14f, 8f)
                lineToRelative(3.41f, -5.72f)
                lineToRelative(-1.72f, -1.02f)
                lineToRelative(-4.02f, 6.74f)
                horizontalLineToRelative(-2.68f)
                lineToRelative(1.69f, -7.39f)
                lineToRelative(-1.95f, -0.45f)
                lineToRelative(-1.79f, 7.84f)
                horizontalLineToRelative(-4.9f)
                lineTo(3.17f, 1.26f)
                lineToRelative(-1.72f, 1.02f)
                lineToRelative(3.41f, 5.72f)
                lineTo(0f, 8.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.77f, 1.42f, 5.21f, 3.56f, 6.65f)
                lineToRelative(-1.98f, 4.35f)
                horizontalLineToRelative(2.2f)
                lineToRelative(1.36f, -3f)
                horizontalLineToRelative(9.71f)
                lineToRelative(1.36f, 3f)
                horizontalLineToRelative(2.2f)
                lineToRelative(-1.98f, -4.35f)
                curveToRelative(2.15f, -1.44f, 3.56f, -3.88f, 3.56f, -6.65f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.86f)
                close()
                moveTo(20f, 13f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _FonduePot = it}
