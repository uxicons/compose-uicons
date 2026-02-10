package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SourceData: ImageVector? = null

val Icons.Bs.SourceData: ImageVector
    get() = _SourceData ?: UXIcon(name = "SourceData") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(4f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(5.54f)
                lineToRelative(0.92f, -1f)
                horizontalLineToRelative(2.31f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(11f)
                close()
                moveTo(7.5f, 14f)
                lineToRelative(3.79f, 3.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(3.79f, -3.71f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(21f, 7f)
                lineToRelative(3f, -7f)
                horizontalLineToRelative(-3.21f)
                lineToRelative(-3f, 7f)
                horizontalLineToRelative(3.21f)
                close()
                moveTo(6.21f, 7f)
                lineTo(3.21f, 0f)
                lineTo(0f, 0f)
                lineToRelative(3f, 7f)
                horizontalLineToRelative(3.21f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                lineTo(9f, 0f)
                close()
                moveTo(13.5f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                lineTo(18f, 0f)
                close()
            }
        }.also { _SourceData = it}
