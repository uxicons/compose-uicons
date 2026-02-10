package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentFail: ImageVector? = null

val Icons.Tr.DocumentFail: ImageVector
    get() = _DocumentFail ?: UXIcon(name = "DocumentFail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-15.21f)
                lineToRelative(-4.79f, -4.79f)
                close()
                moveTo(12f, 3.21f)
                lineTo(15.79f, 7f)
                horizontalLineToRelative(-3.79f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5.79f)
                lineToRelative(-1.5f, -1.49f)
                lineToRelative(-2.99f, 2.99f)
                lineToRelative(-3.0f, -2.99f)
                lineToRelative(-2.99f, 2.99f)
                lineToRelative(-2.99f, -2.99f)
                lineToRelative(-1.52f, 1.51f)
                verticalLineToRelative(-9.31f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 21f)
                verticalLineToRelative(-5.78f)
                lineToRelative(1.52f, -1.51f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(2.99f, -2.99f)
                lineToRelative(3.0f, 2.99f)
                lineToRelative(3.0f, -2.99f)
                lineToRelative(1.5f, 1.48f)
                verticalLineToRelative(5.8f)
                close()
                moveTo(21.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.71f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(2.5f, -2.5f)
                verticalLineToRelative(-12.71f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 17.79f)
                lineTo(21.5f, 19.29f)
                lineTo(20f, 17.79f)
                verticalLineToRelative(-12.29f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _DocumentFail = it}
