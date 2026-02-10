package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _First: ImageVector? = null

val Icons.Tr.First: ImageVector
    get() = _First ?: UXIcon(name = "First") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 10f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(21f, 3.27f)
                verticalLineToRelative(18.23f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(20f, 3.27f)
                curveToRelative(0f, -0.16f, -0.11f, -0.22f, -0.16f, -0.24f)
                curveToRelative(-0.05f, -0.02f, -0.17f, -0.06f, -0.29f, 0.06f)
                lineToRelative(-2.69f, 2.77f)
                curveToRelative(-0.19f, 0.2f, -0.51f, 0.2f, -0.71f, 0.01f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                lineToRelative(2.69f, -2.77f)
                curveToRelative(0.37f, -0.37f, 0.91f, -0.47f, 1.38f, -0.28f)
                curveToRelative(0.47f, 0.2f, 0.78f, 0.66f, 0.78f, 1.17f)
                close()
            }
        }.also { _First = it}
