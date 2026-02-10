package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertSquare: ImageVector? = null

val Icons.Ss.InsertSquare: ImageVector
    get() = _InsertSquare ?: UXIcon(name = "InsertSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.41f, 5.59f)
                lineToRelative(4.79f, 4.7f)
                lineToRelative(-1.4f, 1.43f)
                lineToRelative(-3.8f, -3.73f)
                verticalLineToRelative(16.02f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7.99f)
                lineToRelative(-3.8f, 3.72f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(4.79f, -4.71f)
                curveToRelative(0.77f, -0.77f, 2.04f, -0.77f, 2.82f, 0.01f)
                close()
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _InsertSquare = it}
