package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertSquare: ImageVector? = null

val Icons.Ts.InsertSquare: ImageVector
    get() = _InsertSquare ?: UXIcon(name = "InsertSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.06f, 5.44f)
                lineToRelative(4.79f, 4.7f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(-4.65f, -4.57f)
                verticalLineToRelative(17.71f)
                horizontalLineToRelative(-1f)
                verticalLineTo(6.29f)
                lineToRelative(-4.65f, 4.57f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(4.79f, -4.71f)
                curveToRelative(0.58f, -0.58f, 1.53f, -0.58f, 2.12f, 0.0f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _InsertSquare = it}
