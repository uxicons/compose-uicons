package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LegalDocument: ImageVector? = null

val Icons.Bs.LegalDocument: ImageVector
    get() = _LegalDocument ?: UXIcon(name = "LegalDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21.0f)
                lineToRelative(8.0f, 0.01f)
                lineToRelative(-0.0f, 2.99f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                verticalLineToRelative(5.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(10.74f, 15f)
                horizontalLineToRelative(-5.74f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.81f)
                close()
                moveTo(5f, 10.01f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.38f)
                lineToRelative(0.96f, -3f)
                close()
                moveTo(22.5f, 14.01f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(-1.5f, 4.61f)
                verticalLineToRelative(0.33f)
                curveToRelative(0f, 1.13f, 0.92f, 2.05f, 2.05f, 2.05f)
                curveToRelative(1.06f, 0f, 1.93f, -0.8f, 2.04f, -1.83f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(-0.57f)
                lineToRelative(-0.93f, -2.6f)
                horizontalLineToRelative(1.82f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(8f)
                reflectiveCurveToRelative(0f, -1.99f, 0f, -1.99f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.84f)
                lineToRelative(-0.84f, 2.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-0.34f)
                lineToRelative(-1.5f, -4.66f)
                close()
            }
        }.also { _LegalDocument = it}
