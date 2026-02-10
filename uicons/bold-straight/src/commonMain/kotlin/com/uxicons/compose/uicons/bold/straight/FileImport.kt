package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImport: ImageVector? = null

val Icons.Bs.FileImport: ImageVector
    get() = _FileImport ?: UXIcon(name = "FileImport") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5.67f)
                verticalLineToRelative(18.34f)
                lineTo(2f, 24f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                close()
                moveTo(9f, 19f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3f)
                lineTo(0f, 13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _FileImport = it}
