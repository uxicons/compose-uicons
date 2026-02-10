package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePdf: ImageVector? = null

val Icons.Ts.FilePdf: ImageVector
    get() = _FilePdf ?: UXIcon(name = "FilePdf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.97f, 13f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.97f)
                curveToRelative(1.11f, 0f, 2.01f, -0.92f, 2.01f, -2.02f)
                reflectiveCurveToRelative(-0.9f, -1.98f, -2.01f, -1.98f)
                close()
                moveTo(6.97f, 16f)
                horizontalLineToRelative(-0.97f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.97f)
                curveToRelative(0.56f, 0f, 1.01f, 0.44f, 1.01f, 0.98f)
                reflectiveCurveToRelative(-0.46f, 1.02f, -1.01f, 1.02f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.06f, 0f, -2f, 0f, -2f, 0f)
                verticalLineToRelative(6f)
                reflectiveCurveToRelative(1.94f, 0f, 2f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -1.98f)
                verticalLineToRelative(-2.03f)
                curveToRelative(0f, -1.09f, -0.89f, -1.98f, -2f, -1.98f)
                close()
                moveTo(13f, 17.02f)
                curveToRelative(0f, 0.53f, -0.43f, 0.96f, -0.96f, 0.98f)
                horizontalLineToRelative(-1.04f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.04f)
                curveToRelative(0.53f, 0.02f, 0.96f, 0.46f, 0.96f, 0.98f)
                verticalLineToRelative(2.03f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(14f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
            }
        }.also { _FilePdf = it}
