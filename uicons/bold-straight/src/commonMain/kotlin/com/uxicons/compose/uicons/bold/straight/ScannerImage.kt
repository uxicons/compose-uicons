package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerImage: ImageVector? = null

val Icons.Bs.ScannerImage: ImageVector
    get() = _ScannerImage ?: UXIcon(name = "ScannerImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.76f, 15.83f)
                lineToRelative(0.0f, -0.0f)
                lineTo(3.44f, 0.33f)
                lineToRelative(-1.88f, 2.34f)
                lineToRelative(15.38f, 12.33f)
                lineTo(3.5f, 15.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.07f, -0.48f, -2.03f, -1.24f, -2.67f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _ScannerImage = it}
