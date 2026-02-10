package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SourceDocument: ImageVector? = null

val Icons.Sr.SourceDocument: ImageVector
    get() = _SourceDocument ?: UXIcon(name = "SourceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 19f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(7f, 11f)
                curveToRelative(0.21f, 0f, 0.43f, -0.07f, 0.61f, -0.21f)
                curveToRelative(0.44f, -0.34f, 0.52f, -0.97f, 0.18f, -1.4f)
                lineToRelative(-2.25f, -2.8f)
                curveToRelative(0.29f, -0.46f, 0.46f, -1.0f, 0.46f, -1.58f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(0f, 3.34f, 0f, 5f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                curveToRelative(0.34f, 0f, 0.66f, -0.07f, 0.97f, -0.17f)
                lineToRelative(2.24f, 2.79f)
                curveToRelative(0.2f, 0.25f, 0.49f, 0.39f, 0.79f, 0.39f)
                close()
                moveTo(11f, 5.82f)
                verticalLineToRelative(3.18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                close()
                moveTo(21f, 2f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 0.54f, 0.15f, 1.03f, 0.4f, 1.47f)
                lineToRelative(-2.19f, 2.92f)
                curveToRelative(-0.34f, 0.44f, -0.26f, 1.06f, 0.18f, 1.4f)
                curveToRelative(0.18f, 0.14f, 0.4f, 0.21f, 0.61f, 0.21f)
                curveToRelative(0.3f, 0f, 0.59f, -0.13f, 0.79f, -0.39f)
                lineToRelative(2.12f, -2.83f)
                curveToRelative(0.34f, 0.13f, 0.7f, 0.21f, 1.09f, 0.21f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _SourceDocument = it}
