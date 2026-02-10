package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bucket: ImageVector? = null

val Icons.Bs.Bucket: ImageVector
    get() = _Bucket ?: UXIcon(name = "Bucket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 8f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.66f, -3.22f, -2.86f, -5.87f, -5.8f, -7.16f)
                verticalLineToRelative(-0.84f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(0.84f)
                curveToRelative(-2.94f, 1.29f, -5.14f, 3.94f, -5.8f, 7.16f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.31f)
                lineToRelative(3f, 13f)
                horizontalLineToRelative(13.39f)
                lineToRelative(3f, -13f)
                horizontalLineToRelative(1.31f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8f, 4.26f)
                verticalLineToRelative(0.74f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.74f)
                curveToRelative(1.28f, 0.9f, 2.25f, 2.21f, 2.71f, 3.74f)
                lineTo(5.29f, 8f)
                curveToRelative(0.46f, -1.53f, 1.43f, -2.84f, 2.71f, -3.74f)
                close()
                moveTo(16.31f, 21f)
                lineTo(7.69f, 21f)
                lineToRelative(-1.15f, -5f)
                horizontalLineToRelative(8.87f)
                lineToRelative(0.69f, -3f)
                lineTo(5.85f, 13f)
                lineToRelative(-0.46f, -2f)
                horizontalLineToRelative(13.23f)
                lineToRelative(-2.31f, 10f)
                close()
            }
        }.also { _Bucket = it}
