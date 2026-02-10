package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RightFromBracket: ImageVector? = null

val Icons.Ss.RightFromBracket: ImageVector
    get() = _RightFromBracket ?: UXIcon(name = "RightFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.11f, 9.88f)
                lineTo(13f, 0.07f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                horizontalLineTo(13f)
                verticalLineToRelative(6.95f)
                lineToRelative(10.12f, -9.82f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.13f)
                curveToRelative(0f, -0.8f, -0.31f, -1.56f, -0.89f, -2.13f)
                close()
                moveTo(3f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(6f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _RightFromBracket = it}
