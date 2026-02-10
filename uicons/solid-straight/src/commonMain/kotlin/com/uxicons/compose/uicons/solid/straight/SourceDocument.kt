package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SourceDocument: ImageVector? = null

val Icons.Ss.SourceDocument: ImageVector
    get() = _SourceDocument ?: UXIcon(name = "SourceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(7.78f, 9.38f)
                lineToRelative(-2.24f, -2.8f)
                curveToRelative(0.28f, -0.46f, 0.46f, -1.0f, 0.46f, -1.58f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(0f, 3.34f, 0f, 5f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                curveToRelative(0.34f, 0f, 0.67f, -0.07f, 0.98f, -0.18f)
                lineToRelative(2.24f, 2.8f)
                lineToRelative(1.56f, -1.25f)
                close()
                moveTo(11f, 5.82f)
                verticalLineToRelative(4.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                close()
                moveTo(21f, 2f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.58f, 0.17f, 1.12f, 0.46f, 1.58f)
                lineToRelative(-2.24f, 2.8f)
                lineToRelative(1.56f, 1.25f)
                lineToRelative(2.24f, -2.8f)
                curveToRelative(0.31f, 0.11f, 0.63f, 0.18f, 0.98f, 0.18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _SourceDocument = it}
