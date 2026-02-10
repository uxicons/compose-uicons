package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Document: ImageVector? = null

val Icons.Sc.Document: ImageVector
    get() = _Document ?: UXIcon(name = "Document") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.85f, 6.32f)
                curveToRelative(1.08f, 0.13f, 3.26f, 0.32f, 5.47f, 0.13f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.02f, -0.03f, -0.03f)
                lineTo(15.71f, 1.55f)
                curveToRelative(-0.11f, 2.34f, 0.03f, 3.94f, 0.14f, 4.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 8.41f)
                curveToRelative(-0.85f, 0.09f, -1.69f, 0.12f, -2.48f, 0.12f)
                curveToRelative(-2.44f, 0f, -4.4f, -0.32f, -4.51f, -0.34f)
                curveToRelative(-0.4f, -0.07f, -0.72f, -0.36f, -0.81f, -0.76f)
                curveToRelative(-0.02f, -0.09f, -0.51f, -2.24f, -0.28f, -6.37f)
                curveToRelative(-0.5f, -0.04f, -1.03f, -0.06f, -1.61f, -0.06f)
                curveTo(7.73f, 1f, 4.01f, 1.77f, 3.85f, 1.81f)
                curveToRelative(-0.37f, 0.08f, -0.66f, 0.35f, -0.76f, 0.72f)
                curveToRelative(-0.04f, 0.16f, -1.08f, 4.07f, -1.08f, 9.28f)
                curveToRelative(0f, 5.26f, 1.04f, 9.12f, 1.08f, 9.28f)
                curveToRelative(0.09f, 0.33f, 0.34f, 0.59f, 0.66f, 0.69f)
                curveToRelative(0.16f, 0.05f, 3.92f, 1.22f, 8.36f, 1.22f)
                reflectiveCurveToRelative(8.2f, -1.17f, 8.36f, -1.22f)
                curveToRelative(0.35f, -0.11f, 0.6f, -0.4f, 0.68f, -0.75f)
                curveToRelative(0.03f, -0.16f, 0.83f, -4.04f, 0.83f, -9.22f)
                curveToRelative(0f, -1.23f, -0.06f, -2.35f, -0.17f, -3.4f)
                close()
                moveTo(12.41f, 17.78f)
                lineTo(7.58f, 17.78f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.83f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(16.41f, 13.86f)
                lineTo(7.58f, 13.86f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.83f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Document = it}
