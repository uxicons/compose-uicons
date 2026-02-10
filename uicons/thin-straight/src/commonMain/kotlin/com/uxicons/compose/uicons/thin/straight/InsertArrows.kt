package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertArrows: ImageVector? = null

val Icons.Ts.InsertArrows: ImageVector
    get() = _InsertArrows ?: UXIcon(name = "InsertArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.36f, 6.67f)
                lineTo(0.04f, 0.71f)
                lineTo(0.78f, 0.04f)
                lineToRelative(5.33f, 5.96f)
                curveToRelative(0.57f, 0.64f, 0.89f, 1.47f, 0.89f, 2.33f)
                verticalLineToRelative(9.37f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.26f, 3.26f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.43f, -1.05f, 0.43f)
                reflectiveCurveToRelative(-0.76f, -0.14f, -1.05f, -0.43f)
                lineToRelative(-3.26f, -3.26f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.1f, 3.1f)
                verticalLineToRelative(-9.37f)
                curveToRelative(0f, -0.62f, -0.23f, -1.21f, -0.64f, -1.67f)
                close()
                moveTo(23f, 12f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-9.5f)
                lineTo(0f, 12f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(17.5f, 19f)
                curveToRelative(0.38f, 0f, 0.76f, -0.14f, 1.05f, -0.43f)
                lineToRelative(3.26f, -3.26f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.1f, 3.1f)
                verticalLineToRelative(-9.37f)
                curveToRelative(0f, -0.62f, 0.23f, -1.21f, 0.64f, -1.67f)
                lineTo(23.96f, 0.71f)
                lineToRelative(-0.75f, -0.67f)
                lineToRelative(-5.33f, 5.96f)
                curveToRelative(-0.57f, 0.64f, -0.89f, 1.47f, -0.89f, 2.33f)
                verticalLineToRelative(9.37f)
                lineToRelative(-3.1f, -3.1f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.26f, 3.26f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
                close()
            }
        }.also { _InsertArrows = it}
