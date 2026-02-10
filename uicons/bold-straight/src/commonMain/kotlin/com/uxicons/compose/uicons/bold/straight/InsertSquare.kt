package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertSquare: ImageVector? = null

val Icons.Bs.InsertSquare: ImageVector
    get() = _InsertSquare ?: UXIcon(name = "InsertSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.77f, 6.73f)
                lineToRelative(4.78f, 4.7f)
                lineToRelative(-2.1f, 2.14f)
                lineToRelative(-2.95f, -2.9f)
                verticalLineToRelative(13.33f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-13.33f)
                lineToRelative(-2.95f, 2.9f)
                lineToRelative(-2.1f, -2.14f)
                lineToRelative(4.79f, -4.71f)
                curveToRelative(0.96f, -0.96f, 2.55f, -0.96f, 3.52f, 0.01f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _InsertSquare = it}
