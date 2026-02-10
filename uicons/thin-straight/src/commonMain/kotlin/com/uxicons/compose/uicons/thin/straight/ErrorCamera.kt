package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ErrorCamera: ImageVector? = null

val Icons.Ts.ErrorCamera: ImageVector
    get() = _ErrorCamera ?: UXIcon(name = "ErrorCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(1f, -2f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.78f)
                lineToRelative(-2.26f, 6.03f)
                curveToRelative(-0.22f, 0.58f, -0.78f, 0.97f, -1.41f, 0.97f)
                lineTo(1f, 16f)
                verticalLineToRelative(-5f)
                lineTo(0f, 11f)
                verticalLineToRelative(11f)
                lineTo(1f, 22f)
                verticalLineToRelative(-5f)
                lineTo(6.61f, 17f)
                curveToRelative(1.04f, 0f, 1.98f, -0.65f, 2.34f, -1.62f)
                lineToRelative(2.39f, -6.38f)
                horizontalLineToRelative(8.65f)
                close()
                moveTo(21f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 3.62f)
                lineToRelative(0.31f, -0.62f)
                horizontalLineToRelative(0.69f)
                close()
                moveTo(3f, 6.5f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.69f)
                lineToRelative(-1.19f, 2.38f)
                verticalLineToRelative(4.62f)
                lineTo(4.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 23f)
                horizontalLineToRelative(2.75f)
                lineToRelative(-5.25f, -9.01f)
                lineToRelative(-5.25f, 9.01f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(7.0f, -11.99f)
                lineToRelative(7.0f, 11.99f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17.5f, 21f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(18f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ErrorCamera = it}
