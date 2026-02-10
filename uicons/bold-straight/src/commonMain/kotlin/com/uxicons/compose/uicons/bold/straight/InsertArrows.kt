package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertArrows: ImageVector? = null

val Icons.Bs.InsertArrows: ImageVector
    get() = _InsertArrows ?: UXIcon(name = "InsertArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.24f)
                curveToRelative(0f, -0.12f, 0.05f, -0.24f, 0.13f, -0.33f)
                lineToRelative(5.75f, -6.43f)
                lineTo(21.64f, 0f)
                lineToRelative(-5.75f, 6.43f)
                curveToRelative(-0.57f, 0.64f, -0.89f, 1.47f, -0.89f, 2.33f)
                verticalLineToRelative(6.24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6.24f)
                curveToRelative(0f, -0.86f, -0.32f, -1.69f, -0.89f, -2.33f)
                lineTo(2.36f, 0f)
                lineTo(0.13f, 2f)
                lineToRelative(5.75f, 6.43f)
                curveToRelative(0.08f, 0.09f, 0.13f, 0.21f, 0.13f, 0.33f)
                verticalLineToRelative(6.24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 12.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20.5f, 21f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.43f)
                lineToRelative(3.78f, 3.64f)
                curveToRelative(0.4f, 0.39f, 1.04f, 0.39f, 1.44f, 0f)
                lineToRelative(3.78f, -3.64f)
                lineToRelative(3.78f, 3.64f)
                curveToRelative(0.4f, 0.39f, 1.04f, 0.39f, 1.44f, 0f)
                lineToRelative(3.78f, -3.64f)
                verticalLineToRelative(5.43f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _InsertArrows = it}
