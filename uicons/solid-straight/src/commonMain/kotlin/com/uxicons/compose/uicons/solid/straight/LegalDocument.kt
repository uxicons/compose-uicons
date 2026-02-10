package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LegalDocument: ImageVector? = null

val Icons.Ss.LegalDocument: ImageVector
    get() = _LegalDocument ?: UXIcon(name = "LegalDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                close()
                moveTo(10.16f, 20f)
                horizontalLineToRelative(-5.16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.1f)
                lineToRelative(0.65f, -2f)
                horizontalLineToRelative(-5.75f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.4f)
                lineToRelative(0.65f, -2f)
                horizontalLineToRelative(2.95f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.58f)
                curveToRelative(-0.9f, -0.53f, -1.56f, -1.39f, -1.84f, -2.42f)
                close()
                moveTo(12f, 19f)
                verticalLineToRelative(-0.34f)
                lineToRelative(1.5f, -4.66f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.5f, 4.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.34f)
                lineToRelative(0.84f, -2.66f)
                horizontalLineToRelative(-1.84f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.84f)
                lineToRelative(0.84f, 2.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _LegalDocument = it}
