package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertDocument: ImageVector? = null

val Icons.Rs.ConvertDocument: ImageVector
    get() = _ConvertDocument ?: UXIcon(name = "ConvertDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.41f, 1f)
                horizontalLineToRelative(-7.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(17f)
                lineTo(24f, 7.59f)
                lineToRelative(-6.59f, -6.59f)
                close()
                moveTo(2f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(0f, 23f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(3.03f)
                curveToRelative(-0.44f, 0.58f, -0.77f, 1.26f, -0.92f, 2f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(17f)
                close()
                moveTo(4f, 13f)
                horizontalLineToRelative(9.1f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.8f, 2.8f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(-2.8f, 2.8f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineTo(4f, 15.0f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ConvertDocument = it}
