package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Tr.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.85f, 14.01f)
                curveToRelative(-0.27f, -0.62f, -0.87f, -1.01f, -1.55f, -1.01f)
                lineTo(4.7f, 13f)
                curveToRelative(-0.68f, 0f, -1.28f, 0.39f, -1.55f, 1.01f)
                curveToRelative(-0.28f, 0.62f, -0.16f, 1.32f, 0.3f, 1.83f)
                lineToRelative(6.86f, 7.4f)
                curveToRelative(0.43f, 0.48f, 1.05f, 0.76f, 1.69f, 0.76f)
                reflectiveCurveToRelative(1.26f, -0.28f, 1.69f, -0.75f)
                lineToRelative(6.87f, -7.41f)
                curveToRelative(0.46f, -0.5f, 0.57f, -1.2f, 0.3f, -1.83f)
                close()
                moveTo(19.82f, 15.16f)
                lineToRelative(-6.87f, 7.42f)
                curveToRelative(-0.49f, 0.55f, -1.4f, 0.55f, -1.9f, -0.01f)
                lineToRelative(-6.86f, -7.41f)
                curveToRelative(-0.19f, -0.21f, -0.24f, -0.49f, -0.12f, -0.75f)
                reflectiveCurveToRelative(0.35f, -0.41f, 0.64f, -0.41f)
                horizontalLineToRelative(14.61f)
                curveToRelative(0.28f, 0f, 0.52f, 0.15f, 0.64f, 0.41f)
                reflectiveCurveToRelative(0.07f, 0.54f, -0.12f, 0.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.7f, 11f)
                horizontalLineToRelative(14.61f)
                curveToRelative(0.68f, 0f, 1.28f, -0.39f, 1.55f, -1.01f)
                curveToRelative(0.28f, -0.62f, 0.16f, -1.32f, -0.3f, -1.83f)
                lineTo(13.69f, 0.76f)
                curveToRelative(-0.86f, -0.96f, -2.53f, -0.95f, -3.38f, -0.01f)
                lineTo(3.45f, 8.16f)
                curveToRelative(-0.46f, 0.5f, -0.57f, 1.2f, -0.3f, 1.83f)
                curveToRelative(0.27f, 0.62f, 0.87f, 1.01f, 1.55f, 1.01f)
                close()
                moveTo(4.18f, 8.84f)
                lineTo(11.05f, 1.42f)
                curveToRelative(0.24f, -0.27f, 0.58f, -0.42f, 0.95f, -0.42f)
                reflectiveCurveToRelative(0.7f, 0.15f, 0.95f, 0.43f)
                lineToRelative(6.86f, 7.41f)
                curveToRelative(0.19f, 0.21f, 0.24f, 0.49f, 0.12f, 0.75f)
                reflectiveCurveToRelative(-0.35f, 0.41f, -0.64f, 0.41f)
                lineTo(4.7f, 10f)
                curveToRelative(-0.28f, 0f, -0.52f, -0.15f, -0.64f, -0.41f)
                reflectiveCurveToRelative(-0.07f, -0.54f, 0.12f, -0.75f)
                close()
            }
        }.also { _Sort = it}
