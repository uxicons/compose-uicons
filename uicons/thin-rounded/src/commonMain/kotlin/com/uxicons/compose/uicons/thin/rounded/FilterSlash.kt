package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterSlash: ImageVector? = null

val Icons.Tr.FilterSlash: ImageVector
    get() = _FilterSlash ?: UXIcon(name = "FilterSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.18f, -0.1f, 0.35f, -0.26f, 0.44f)
                curveToRelative(-0.07f, 0.04f, -0.16f, 0.06f, -0.24f, 0.06f)
                curveToRelative(-0.09f, 0f, -0.19f, -0.03f, -0.27f, -0.08f)
                lineToRelative(-5f, -3.18f)
                curveToRelative(-0.14f, -0.09f, -0.23f, -0.25f, -0.23f, -0.42f)
                verticalLineToRelative(-5.38f)
                lineTo(2.88f, 7.67f)
                curveToRelative(-0.27f, -0.3f, -0.47f, -0.63f, -0.62f, -0.98f)
                curveToRelative(-0.1f, -0.26f, 0.02f, -0.55f, 0.27f, -0.65f)
                curveToRelative(0.25f, -0.1f, 0.55f, 0.02f, 0.65f, 0.27f)
                curveToRelative(0.1f, 0.25f, 0.25f, 0.48f, 0.42f, 0.68f)
                lineToRelative(6.25f, 6.4f)
                curveToRelative(0.09f, 0.09f, 0.14f, 0.22f, 0.14f, 0.35f)
                verticalLineToRelative(5.31f)
                lineToRelative(4f, 2.55f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.85f, 23.85f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.15f, 0.85f)
                curveTo(-0.05f, 0.66f, -0.05f, 0.34f, 0.15f, 0.15f)
                reflectiveCurveTo(0.66f, -0.05f, 0.85f, 0.15f)
                lineTo(3.38f, 2.68f)
                curveToRelative(0.58f, -0.43f, 1.28f, -0.68f, 2.01f, -0.68f)
                horizontalLineToRelative(13.2f)
                curveToRelative(1.87f, 0f, 3.4f, 1.52f, 3.4f, 3.4f)
                curveToRelative(0f, 0.83f, -0.3f, 1.64f, -0.86f, 2.26f)
                lineToRelative(-6.32f, 6.46f)
                lineToRelative(9.03f, 9.03f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(4.1f, 3.39f)
                lineTo(14.12f, 13.41f)
                lineToRelative(6.3f, -6.43f)
                curveToRelative(0.37f, -0.42f, 0.59f, -0.99f, 0.59f, -1.58f)
                curveToRelative(0f, -1.32f, -1.08f, -2.4f, -2.4f, -2.4f)
                lineTo(5.4f, 3f)
                curveToRelative(-0.47f, 0f, -0.91f, 0.14f, -1.3f, 0.39f)
                close()
            }
        }.also { _FilterSlash = it}
