package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompassPaper: ImageVector? = null

val Icons.Ts.DraftingCompassPaper: ImageVector
    get() = _DraftingCompassPaper ?: UXIcon(name = "DraftingCompassPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-18.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0f, 0.34f, 0.04f, 0.68f, 0.1f, 1f)
                horizontalLineToRelative(-3.6f)
                curveToRelative(-0.98f, 0f, -1.86f, -0.41f, -2.5f, -1.06f)
                verticalLineToRelative(15.56f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-15.56f)
                curveToRelative(-0.64f, 0.65f, -1.52f, 1.06f, -2.5f, 1.06f)
                horizontalLineToRelative(-3.6f)
                curveToRelative(0.07f, -0.32f, 0.1f, -0.66f, 0.1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -1.48f, 1.08f, -2.71f, 2.5f, -2.95f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.05f)
                curveToRelative(1.42f, 0.24f, 2.5f, 1.47f, 2.5f, 2.95f)
                curveToRelative(0f, 0.83f, -0.34f, 1.58f, -0.89f, 2.13f)
                lineToRelative(2.71f, 5.87f)
                horizontalLineToRelative(2.18f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.72f)
                lineToRelative(1.75f, 3.79f)
                lineToRelative(-0.91f, 0.42f)
                lineToRelative(-1.94f, -4.21f)
                horizontalLineToRelative(-8.36f)
                lineToRelative(-1.94f, 4.21f)
                lineToRelative(-0.91f, -0.42f)
                lineToRelative(1.75f, -3.79f)
                horizontalLineToRelative(-1.72f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.18f)
                lineToRelative(2.71f, -5.87f)
                curveToRelative(-0.55f, -0.54f, -0.89f, -1.3f, -0.89f, -2.13f)
                close()
                moveTo(13.28f, 7.71f)
                curveToRelative(-0.39f, 0.18f, -0.82f, 0.29f, -1.27f, 0.29f)
                reflectiveCurveToRelative(-0.89f, -0.11f, -1.27f, -0.29f)
                lineToRelative(-2.44f, 5.29f)
                horizontalLineToRelative(7.44f)
                lineToRelative(-2.44f, -5.29f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _DraftingCompassPaper = it}
