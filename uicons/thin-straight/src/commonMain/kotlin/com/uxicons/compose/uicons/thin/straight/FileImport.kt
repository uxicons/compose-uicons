package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImport: ImageVector? = null

val Icons.Ts.FileImport: ImageVector
    get() = _FileImport ?: UXIcon(name = "FileImport") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(1f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(10.87f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.87f)
                curveToRelative(-0.04f, -0.07f, -0.09f, -0.13f, -0.15f, -0.19f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.77f, 0.77f, 0.77f, 2.02f, 0f, 2.79f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.06f, -0.06f, 0.11f, -0.12f, 0.15f, -0.19f)
                close()
            }
        }.also { _FileImport = it}
