package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cursor: ImageVector? = null

val Icons.Br.Cursor: ImageVector
    get() = _Cursor ?: UXIcon(name = "Cursor") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.52f, 10.9f)
            lineToRelative(-10.85f, -10.05f)
            arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.67f, 2.55f)
            verticalLineToRelative(15.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.52f, 1.1f)
            lineToRelative(3.67f, -3.4f)
            lineToRelative(2.92f, 6.41f)
            arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.55f, -2.32f)
            lineToRelative(-2.81f, -6.12f)
            lineToRelative(4.86f, -0.68f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, -2.59f)
            close()
            moveTo(11.06f, 11.67f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.81f, 0.39f)
            lineToRelative(-3.25f, 3.01f)
            verticalLineToRelative(-11.66f)
            arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.24f, -0.37f)
            arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, -0.04f)
            arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 0.09f)
            lineToRelative(8.51f, 7.88f)
            close()
        }
    }.also { _Cursor = it }
