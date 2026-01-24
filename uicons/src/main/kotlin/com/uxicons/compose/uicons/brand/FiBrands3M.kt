package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.uxicons.compose.uicons.UXI

val UXI.BRAND.FiBrands3M: ImageVector
    get() {
        if (_FiBrands3M != null) {
            return _FiBrands3M!!
        }
        _FiBrands3M = ImageVector.Builder(
            name = "BRAND.FiBrands3M",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.905f, 5.972f)
                lineToRelative(-1.733f, 7.053f)
                lineToRelative(-1.739f, -7.053f)
                horizontalLineToRelative(-5.099f)
                verticalLineToRelative(2.605f)
                curveTo(9.722f, 6.297f, 7.561f, 5.726f, 5.56f, 5.694f)
                curveTo(3.121f, 5.662f, 0.564f, 6.718f, 0.47f, 9.943f)
                horizontalLineToRelative(3.374f)
                curveToRelative(0f, -0.973f, 0.747f, -1.53f, 1.588f, -1.517f)
                curveToRelative(1.033f, -0.008f, 1.509f, 0.433f, 1.533f, 1.12f)
                curveToRelative(-0.036f, 0.596f, -0.388f, 1.011f, -1.525f, 1.011f)
                horizontalLineTo(4.306f)
                verticalLineToRelative(2.341f)
                horizontalLineToRelative(1.031f)
                curveToRelative(0.584f, 0f, 1.399f, 0.318f, 1.431f, 1.151f)
                curveToRelative(0.039f, 0.993f, -0.652f, 1.43f, -1.502f, 1.438f)
                curveToRelative(-1.517f, -0.056f, -1.763f, -1.222f, -1.763f, -2.224f)
                horizontalLineTo(0f)
                curveToRelative(0.016f, 0.675f, -0.151f, 5.075f, 5.337f, 5.043f)
                curveToRelative(2.629f, 0.024f, 4.464f, -1.08f, 5.004f, -2.605f)
                verticalLineToRelative(2.335f)
                horizontalLineToRelative(3.455f)
                verticalLineToRelative(-7.609f)
                lineToRelative(1.867f, 7.609f)
                horizontalLineToRelative(3.018f)
                lineToRelative(1.874f, -7.601f)
                verticalLineToRelative(7.609f)
                horizontalLineTo(24f)
                verticalLineTo(5.972f)
                horizontalLineTo(18.905f)
                close()
                moveTo(10.343f, 13.009f)
                curveToRelative(-0.429f, -0.89f, -1.034f, -1.279f, -1.376f, -1.402f)
                curveToRelative(0.715f, -0.318f, 1.09f, -0.749f, 1.376f, -1.608f)
                verticalLineTo(13.009f)
                close()
            }
        }.build()

        return _FiBrands3M!!
    }

@Suppress("ObjectPropertyName")
private var _FiBrands3M: ImageVector? = null
