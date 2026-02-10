package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertDocument: ImageVector? = null

val Icons.Bs.ConvertDocument: ImageVector
    get() = _ConvertDocument ?: UXIcon(name = "ConvertDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(0f, 23f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(2.76f)
                curveToRelative(-0.69f, 0.83f, -1.13f, 1.87f, -1.24f, 3f)
                horizontalLineToRelative(-1.52f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(11f, 17.52f)
                lineToRelative(3.65f, -3.18f)
                curveToRelative(0.49f, -0.44f, 0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(-3.65f, -3.16f)
                verticalLineToRelative(2.48f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.52f)
                close()
                moveTo(22.98f, 5.64f)
                lineToRelative(-3.58f, -3.6f)
                curveToRelative(-0.65f, -0.66f, -1.56f, -1.04f, -2.48f, -1.04f)
                horizontalLineToRelative(-6.42f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-14.89f)
                curveToRelative(0f, -0.93f, -0.36f, -1.8f, -1.02f, -2.46f)
                close()
            }
        }.also { _ConvertDocument = it}
