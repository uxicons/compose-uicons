package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendar: ImageVector? = null

val Icons.Bs.Calendar: ImageVector
    get() = _Calendar ?: UXIcon(name = "Calendar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(0f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                close()
                moveTo(3f, 21f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                close()
            }
        }.also { _Calendar = it}
